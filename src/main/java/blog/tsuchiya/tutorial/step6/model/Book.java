package blog.tsuchiya.tutorial.step6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

/**
 * 書籍を意味するエンティティクラス。
 * Entityアノテーションを付けるとデータベースのカラムを意味する
 * クラスとして扱える。
 */
@Entity
@Data
public class Book {
	
	/**
	 * フィールにアノテーションを付けることでどういう制約がある
	 * 絡むなのか定義できる。
	 * Idアノテーションで主キーであること、
	 * GeneratedValueアノテーションで自動採番することを示している。
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * こちらはNotNullでnullではないこと、Sizeで
	 * 最大文字が255文字であることを示している。
	 */
	@NotNull
	@Size(max=255)
	private String title;
}
