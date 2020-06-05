package package plibss.PLIBSSserver.DAO;

public class LibraryfDAO {
    private static final String SQL_SELECT = "SELECT 사용자id, 도서관id FROM `도서관 즐겨찾기`";
    private LibraryfDAO() {}
    private static class LazyHolder {
        public static final BookDAO INSTANCE = new LibraryfDAO();
    }
    private static LibraryfDAO getInstance() {
        return LazyHolder.INSTANCE;
    }
}