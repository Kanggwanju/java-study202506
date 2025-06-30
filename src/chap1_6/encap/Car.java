package chap1_6.encap;

public class Car {

    private String model; // 모델명
    private String mode; // 변속모드 (P, N, R, D)
    private String ownerName; // 차주명
    private boolean on; // 시동 여부

    // 생성자
    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // 변속을 수행하는 메서드 (setter 메서드: 필드값을 안전하게 처리하는 메서드)
    public void setMode(String mode) {
        switch (mode) {
            case "D": case "R": case "N": case "P":
                this.mode = mode;
                break;
            default:
                this.mode = "P";
        }
    }

    public String getMode() {
        return mode;
    }

    // 기능
    // 엔진오일을 분사하는 기능
    private void injectOil() {
        System.out.println("엔진오일이 분사됩니다.");
    }

    // 엔진 실린더가 반복 작동하는 기능
    private void moveCylinder() {
        if (!on) {
            System.out.println("시동이 안 걸린 상태에서는 차량이 폭발합니다. 뻥!");
            return;
        }
        System.out.println("엔진 실린더가 작동합니다.");
    }

    // 시동이 걸리는 기능
    private void powerOn() {
        on = true;
        System.out.println("시동이 걸렸습니다.");
    }

    // 시동 버튼을 누르는 기능
    public void pressButton() {
        System.out.println("시동 버튼을 눌렀습니다.");
        injectOil();
        powerOn();
        moveCylinder();
    }
}
