package chap2_8.stream;

public class DishDetail {

    private String menuName;
    private String typeName;

    public DishDetail(Dish dish) {
        this.menuName = dish.getName();
        this.typeName = dish.getType().getTypeName();
    }

    @Override
    public String toString() {
        return "{" +
            "menuName: '" + menuName + '\'' +
            ", typeName: '" + typeName + '\'' +
            '}';
    }
}
