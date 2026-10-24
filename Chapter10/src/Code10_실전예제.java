import java.util.Arrays;

public class Code10_실전예제 {
	static int[] getLotto() {
		int[] lottoAry = {};
		int num =0;
		
		my_loop:
		while(true) {
			num = (int)(Math.random()*45+1);
			
			for(int v : lottoAry) {
				if (num == v)
					continue my_loop;
			}
			lottoAry = Arrays.copyOf(lottoAry, lottoAry.length + 1);
			lottoAry[lottoAry.length-1] = num;
			if(lottoAry.length == 6)
				break;
		}
		Arrays.sort(lottoAry);
		return lottoAry;
	}
	public static void main(String[] args) {
		int WIDTH = 500, HEIGHT = 500;
		
		Turtle turtle = new Turtle();
		turtle.speed(50);
		turtle.outlineColor("white");
		turtle.setCanvasSize(WIDTH+100, HEIGHT+100);
		
		turtle.left(90);
		turtle.penColor("gray");
		for(int i=0; i<45; i++) {
			turtle.up();
			turtle.setPosition(0, 0);
			turtle.down();
			turtle.right(8);
			turtle.forward(150);
		}
		
		int[] lotto = getLotto();
		System.out.println("로또 번호 ==> " + Arrays.toString(lotto));
		turtle.width(10);
		turtle.penColor("red");
		for(int num : lotto) {
			turtle.up();
			turtle.home();
			turtle.left(90);
			turtle.down();
			turtle.right(8*num);
			turtle.forward(200);
		}
	}

}
