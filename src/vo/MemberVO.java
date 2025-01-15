package vo;

import java.util.Date;
import lombok.*;

@Data
public class MemberVO {

  private String id, pwd, name, sex, email, address, msg;
  private Date reg_date, birthday;

}
