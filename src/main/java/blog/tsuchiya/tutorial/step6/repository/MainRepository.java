package blog.tsuchiya.tutorial.step6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.tsuchiya.tutorial.step6.model.Book;

/**
 * データの永続化を行う。
 * 今回はJPAの仕組みを使うのでコンクリートクラスではなく
 * インタフェースを使っている。
 * JpaRepositoryを継承した@Repositoryのインタフェースを作成すると、
 * JPAが自動でコンクリートクラスを作成してくれる。
 */
@Repository
public interface MainRepository extends JpaRepository<Book, Long>{

}
