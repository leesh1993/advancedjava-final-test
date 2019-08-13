package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		//곱할 숫자 
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		
		//답
		resultNumber = l * r;

		
		int[] answerNumbers = randomizeAnswers();
		int loc = randomize( 0, 8 );
		//9개의 랜덤숫자중 한 곳에 답 넣기
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}




		//
		//  이 부분에 적당한 코드를 작성합니다.  
		//
	
		while(true) {
			System.out.print( "\n" );
			System.out.print( "answer:" );
			Scanner s = new Scanner( System.in );
			int myAnswer = s.nextInt();
			
			if(resultNumber == myAnswer) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답");
			}
		}
	
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0; // 0 ~ 8
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1; // 81까지 랜덤값
	        
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if( boardNumbers[i] == random ) {
	        		evaluted = true;
	        		break;
	        	}
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
}
