package hello.springmvcjpa.domain.shop;

import hello.springmvcjpa.domain.Pos;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter

public class Shop {

    @Id
    @GeneratedValue
    @Column(name = "shop_id")
    private Long id;

    @NotEmpty
    private String shop;

    private String pos;
   /* @Embedded
    private Pos pos;*/



    /*@OneToMany(cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();*/

    //private List<Review> reviewList = new ArrayList<>(3);

    /*public Shop() {}*/

    //public Shop(String shop, Pos pos) {
    public Shop(String shop, String pos) {
        this.shop = shop;
        this.pos = pos;
        //this.items = items;
    }

    public Shop change(Shop shop){
        this.shop=shop.getShop();
        this.pos=shop.getPos();
        return this;
    }

    /*public void editPos(Pos pos) {
        this.pos = pos;
    }*/

}
