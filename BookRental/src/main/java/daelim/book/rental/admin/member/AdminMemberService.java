package daelim.book.rental.admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminMemberService {

    @Autowired
    private AdminMemberDao adminMemberDao;

    final static public int ADMIN_ACCOUNT_CREATE_SUCCESS = 1;
    final static public int ADMIN_ACCOUNT_CREATE_EXISTS = 0;
    final static public int ADMIN_ACCOUNT_CREATE_FAIL = -1;

    public int createAccount(AdminMemberVo adminMemberVo){
        System.out.println("[AdminMemberService] createAccount()");

        boolean isMember = adminMemberDao.existAdminAccount(adminMemberVo.getId());
        if(!isMember) {
            int result = adminMemberDao.insertAdminAccount(adminMemberVo);
            if(result > 0) {
                System.out.println("[AdminMemberService] createAccount success");
                return ADMIN_ACCOUNT_CREATE_SUCCESS;
            } else {
                System.out.println("[AdminMemberService] createAccount fail");
                return ADMIN_ACCOUNT_CREATE_FAIL;
            }
        } else {
            System.out.println("[AdminMemberService] createAccount already exists");
            return ADMIN_ACCOUNT_CREATE_EXISTS;
        }
    }

    public AdminMemberVo loginConfirm(AdminMemberVo adminMemberVo){
        System.out.println("[AdminMemberService] loginConfirm()");
        AdminMemberVo loginedAdminMemberVo = adminMemberDao.selectAdmin(adminMemberVo);

        if(loginedAdminMemberVo != null){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Fail");
        }
        return loginedAdminMemberVo;
    }

    public List<AdminMemberVo> selectAllAdmin(){
        System.out.println("[AdminMemberService] selectAllAdmin()");
        return adminMemberDao.selectAllAdmin();
    }

    public void setAdminApproval(int no) {
        System.out.println("[AdminMemberService] setAdminApproval " + no);
        int result = adminMemberDao.updateAdminAccount(no);
    }
}
