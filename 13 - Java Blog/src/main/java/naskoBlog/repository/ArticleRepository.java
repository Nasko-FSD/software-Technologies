package naskoBlog.repository;

import naskoBlog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    List<Article> findAllByAuthor_id(Integer id);

}
