package package plibss.PLIBSSserver.DAO;

public class BookfDAO {
    private static final String SQL_SELECT = "SELECT 사용자id, 도서명 FROM `도서 즐겨찾기`";
    private BookfDAO() {}
    private static class LazyHolder {
        public static final BookfDAO INSTANCE = new BookfDAO();
    }
    private static BookfDAO getInstance() {
        return LazyHolder.INSTANCE;
    }
}