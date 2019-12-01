import java.io*;

class Parser {
	static int look;

	public Parsers()throws IOException{
		look = System.in.read();
	}

	void expr() throws IOException{
	term();
	while(true){
	if(look == '+'){
         match('+'); term(); System.out.write('+');

	}
	else if( look == '-'){
	match('-'); term(); System.out.write('-');
	}
	else return;
	}
	}
	void term() throws IOException {
		if ( Chara.isDigit((char)look){
		System.out.write((char)look);match(look);
		}
		else throw new Error("syntax error");
	}
	void match(int t) throws IOException{
	if( look == t) look= System.in.read();
	else throw new Error("syntax error");
	}
	}
public class Postfix{
public static void main(String[] args) throws IOException{
	Parser parse = new Parser();
	parse.expr(); System.out.write('\n');
}

