package blog.tsuchiya.tutorial.step6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import blog.tsuchiya.tutorial.step6.model.Book;
import blog.tsuchiya.tutorial.step6.repository.MainRepository;
import lombok.RequiredArgsConstructor;

/**
 * ビジネスロジックを記述するクラス。
 * ServiceからRepositoryを使うようにする。
 */
@Service
@RequiredArgsConstructor
public class MainService {

	private final MainRepository repository;
	
	/**
	 * 入力したタイトルを書籍データベースに登録する。
	 * @param title
	 */
	public void save(String title) {
		Book book = new Book();
		book.setTitle(title);
		this.repository.save(book);
	}
	
	/**
	 * すべての書籍データを返す
	 * @return 書籍データ
	 */
	public List<Book> findAll(){
		return this.repository.findAll();
	}
}
