package lognoziroh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import lognoziroh.bindingModel.ReportBindingModel;
import lognoziroh.repository.ReportRepository;
import lognoziroh.entity.Report;

import java.util.List;

@Controller
public class ReportController {
	private final ReportRepository reportRepository;

	@Autowired
	public ReportController(ReportRepository reportRepository) {
		this.reportRepository = reportRepository;
	}

	@GetMapping("/")
	public String index(Model model) {

		List<Report> allReports = this.reportRepository.findAll();

		model.addAttribute("view", "report/index");
		model.addAttribute("reports", allReports);

		return "base-layout";
	}

	@GetMapping("/details/{id}")
	public String details(Model model, @PathVariable int id) {

		Report report = this.reportRepository.findOne(id);

		model.addAttribute("view", "report/details");
		model.addAttribute("report", report);

		return "base-layout";
	}

	@GetMapping("/create")
	public String create(Model model) {

		model.addAttribute("view", "report/create");

		return "base-layout";
	}

	@PostMapping("/create")
	public String createProcess(Model model, ReportBindingModel reportBindingModel) {

		Report report = new Report(
				reportBindingModel.getStatus(),
				reportBindingModel.getMessage(),
				reportBindingModel.getOrigin()
		);

		reportRepository.saveAndFlush(report);

		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {

		Report report = this.reportRepository.findOne(id);

		model.addAttribute("view", "report/delete");
		model.addAttribute("report", report);

		return "base-layout";
	}

	@PostMapping("/delete/{id}")
	public String deleteProcess(@PathVariable int id, ReportBindingModel reportBindingModel) {

		Report report = this.reportRepository.findOne(id);

		reportRepository.delete(report);

		return "redirect:/";
	}
}
