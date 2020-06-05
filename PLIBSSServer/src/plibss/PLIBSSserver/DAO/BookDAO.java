package package plibss.PLIBSSserver.DAO;

import plibss.core.model.Book;
public class BookDAO {
    private static final String SQL_SELECT = "SELECT 도서명, 도서관id, 저자, 키워드, 발행년도, KDC분류기호, ISBN FROM `도서 정보`";
    private BookDAO() {}
    private static class LazyHolder {
        public static final BookDAO INSTANCE = new BookDAO();
    }
    private static BookDAO getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Book match(ResultSet rs) throws IOException, SQLException, Exception {
        Book bk = new Book();
        bk.setYear
    }
}