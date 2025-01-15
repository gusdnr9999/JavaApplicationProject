package vo;

import lombok.Data;

@Data
public class FoodVO {

  private int fno, hit;
  private double score;
  private String name, type, phone, address, theme, poster, images, time, parking, content, price;

}
