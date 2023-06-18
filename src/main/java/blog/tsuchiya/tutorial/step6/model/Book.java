package blog.tsuchiya.tutorial.step6.model;

// v2.5.6から3.1.0にバージョン変更した際、パッケージがjavaxからjakartaに変更になりました
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
