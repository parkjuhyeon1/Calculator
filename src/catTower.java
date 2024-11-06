class Cat{
    String type;
    String gender;
    String age;
    String hair;
    Cat(){} // 기본 생성자
    Cat(String type, String gender, String age, String fuelType){
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.hair = fuelType;
    }
}

public class catTower {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Cat Siamese = new Cat(
                "샴고양이", // <- type
                "수컷", // <- gender
                "2살", // <- age
                "장모종" // <- fuelType
        );
        Cat Domestic_Shorthair = new Cat(
                "도메스틱 숏헤어 (코숏)", // <- type
                "암컷", // <- gender
                "1살", // <- age
                "단모종" // <- fuelType
        );
        Cat Bombay = new Cat(
                "봄베이", // <- type
                "암컷", // <- gender
                "1살", // <- age
                "단모종" // <- fuelType
        );
        System.out.println("저희 가게에는 다음과 같은 고양이들이 있습니다.");
        System.out.println("1. " + Siamese.type + " " + Siamese.gender + " (" + Siamese.age + ", " + Siamese.hair + ")");
        System.out.println("2. " + Domestic_Shorthair.type + " " + Domestic_Shorthair.gender + " (" + Domestic_Shorthair.age + ", " + Domestic_Shorthair.hair + ")");
        System.out.println("3. " + Bombay.type + " " + Bombay.gender + " (" + Bombay.age + ", " + Bombay.hair + ")");
    }
}