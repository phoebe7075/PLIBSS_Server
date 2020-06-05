package package plibss.PLIBSSserver.DAO;

public class LibraryDAO {
    private static final String SQL_SELECT = "SELECT 도서관id, 도서관명, 시도명, 시군구명, 도서관유형, 홈페이지주소, 도서관전화번호, 공휴일운영종료시각, 공휴일운영시작시각, 토요일운영종료시각, " +
            "토요일운영시작시각, 평일운영종료시각, 평일운영시작시각, 휴관일, 대출가능일수, 대출가능권수, 열람좌석수 FROM `도서관 정보`";
    private LibraryDAO() {}
    private static class LazyHolder {
        public static final LibraryDAO INSTANCE = new LibraryDAO();
    }
    private static LibraryDAO getInstance() {
        return LazyHolder.INSTANCE;
    }
}