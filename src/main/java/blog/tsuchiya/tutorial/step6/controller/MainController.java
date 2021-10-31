package blog.tsuchiya.tutorial.step6.controller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.tsuchiya.tutorial.step6.service.MainService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {

	/**
	 * ControllerではServiceを呼ぶ。今回の機能を実装するだけなら
	 * このようにする必要はないが、今後規模が大きくなった際の
	 * 役割分担を意識している。
	 */
	private final MainService service;
	@RequestMapping
	public String index(@RequestParam(required = false) String title, Model model) {
		// タイトルが入力されたらデータベースに保存する
		if(!Objects.isNull(title) && !title.isBlank()) {
			this.service.save(title);
		}
		model.addAttribute("books", this.service.findAll());
		return "index";
	}
}
