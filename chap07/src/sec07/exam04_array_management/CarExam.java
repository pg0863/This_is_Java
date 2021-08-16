package sec07.exam04_array_management;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // 펑크난 타이어의 위치(1~4)
			if(problemLocation != 0) { // 모든 타이어가 펑크나지 않았으면
				System.out.println(car.tires[problemLocation-1].location+"한국타이어로 교체");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------");
		}
	}

}
