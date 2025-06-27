package chap1_5.member;

/**
 * MemberRepository 클래스는 Member 객체를 관리하는 저장소 역할을 합니다.
 * CRUD 작업을 수행할 수 있는 메서드를 제공하며 회원 추가,
 * 회원 목록 조회, 특정 조건으로 회원 검색 등의 기능을 수행합니다.
 *
 * @author KGJ
 * @since 2025.06.27 ~
 * @version 1.0
 */
// 회원들의 CRUD를 담당하는 창고(데이터베이스) 역할
public class MemberRepository {

    // 회원들을 저장할 배열
    // String[] => ['', '', '']
    // int[] => [10, 20, 30]
    // Member[] => [{ id: '', memberName: '' }, {}, {}]
    Member[] memberList; // 가입된 회원 배열

    MemberRepository() {
        memberList = new Member[] {
                new Member(15, "abc123@def.com", "1234", "콩벌레", Gender.MALE)
                , new Member(25, "fff@ggg.com", "5678", "팥죽이", Gender.FEMALE)
                , new Member(35, "xxx@ccc.com", "9876", "카레빵", Gender.FEMALE)
        };

    }

    // 메서드

    // 회원 배열을 리턴하는 메서드
    Member[] getMembers() {
        return this.memberList;
    }

    /**
     * 현재 회원 목록에 저장된 회원 수를 반환합니다.
     * memberList.length 필드에 직접 접근하는 대신 메서드를 통해 접근하므로써
     * 내부 구현을 캡슐화하고 향후 회원수를 계산하는 로직이 변경되더라도 사용 코드를 수정할 필요가 없어집니다.
     *
     * @return 회원 목록의 총 회원 수
     */
    int size() {
        return memberList.length;
    }

    /**
     * 멤버 리스트에 새로운 멤버를 추가합니다.
     *
     * @param newMember 추가할 새로운 멤버의 정보를 담고 있는 Member 객체
     */
    void addMember(Member newMember) {
        // 배열에 push를 적용
        // 1. 기존배열보다 1개 더 큰 새로운 배열 생성
        Member[] temp = new Member[memberList.length + 1];
        // 2. 기존배열의 데이터를 복사해서 신규배열에 저장
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        // 3. 신규데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newMember;
        // 4. 신규배열을 실제 배열로 변경
        memberList = temp;
    }

    /**
     * 회원 목록에서 주어진 이메일 주소로 회원을 검색합니다.
     * 일치하는 이메일을 가진 회원이 발견되면 해당 회원이 반환됩니다.
     * 일치하는 회원이 없으면 null이 반환됩니다.
     *
     * @param targetEmail 검색할 회원의 이메일 주소
     * @return 해당 이메일을 가진 회원 객체,
     * 해당 이메일을 가진 회원이 없는 경우 null
     *
     * @author KGJ
     * @since 2025.06.27
     */
    Member findMemberByEmail(String targetEmail) {
        for (Member member : memberList) {
            if (targetEmail.equals(member.email)) {
                return member;
            }
        }
        return null; // 탐색에 실패한 경우
    }

    boolean isDuplicateEmail(String inputEmail) {
        return findMemberByEmail(inputEmail) != null;
    }
}
