package chap2_8.practice.q1;

public class Trader {
    private String name; // 거래자 이름
    private String city; // 거래자 거주 도시

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
            name + " in " +
            city
            ;
    }
}
