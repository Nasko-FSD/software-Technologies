package naskoBlog.controller;

import naskoBlog.entity.Article;
import naskoBlog.repository.ArticleRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import naskoBlog.bindingModel.UserBindingModel;
import naskoBlog.entity.Role;
import naskoBlog.entity.User;
import naskoBlog.repository.RoleRepository;
import naskoBlog.repository.UserRepository;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UserController {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final ArticleRepository articleRepository;

    public UserController(RoleRepository roleRepository, UserRepository userRepository, ArticleRepository articleRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.articleRepository = articleRepository;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("view", "user/register");

        return "base-layout";
    }

    @PostMapping("/register")
    public String registerProcess(UserBindingModel userBindingModel){

        if(!userBindingModel.getPassword().equals(userBindingModel.getConfirmPassword())){
            return "redirect:/register";
        }

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        User user = new User(
                userBindingModel.getEmail(),
                userBindingModel.getFullName(),
                bCryptPasswordEncoder.encode(userBindingModel.getPassword())
        );

        Role userRole = this.roleRepository.findByName("ROLE_USER");

        user.addRole(userRole);

        this.userRepository.saveAndFlush(user);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("view", "user/login");

        return "base-layout";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }

        return "redirect:/login?logout";
    }

    @GetMapping("/profile")
    @PreAuthorize("isAuthenticated()")
    public String profilePage(Model model){
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();

        User user = this.userRepository.findByEmail(principal.getUsername());

        model.addAttribute("user", user);
        model.addAttribute("view", "user/profile");

        return "base-layout";
    }

    @GetMapping("/myArticles")
    @PreAuthorize("isAuthenticated()")
    public String myArticles(Model model){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();

        User user = this.userRepository.findByEmail(userDetails.getUsername());

        List<Article> articleList = this.articleRepository.findAllByAuthor_id(user.getId());

        model.addAttribute("view", "article/myArticles");
        model.addAttribute("articles", articleList);
        model.addAttribute("user", user);

        return "base-layout";
    }
}

