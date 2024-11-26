

//question 1

private int summation(){
	int sum = 0;
	for (int i = 2; i <= 200; i+=2){
		sum += i;
	}
	return sum;
}

//question 2

//note: more solutions possible
private double verify (String s){
	try {
		double temp = Double.parseDouble(s);
		return temp;
	}
	catch (Exception e){
		System.out.println ("Error, not a string");
		return -1.0;
	}
}

//Question 3

//assume the char is called choice
if (choice == 'a'){
	method1();
}
else if (choice == 'b'){
	method2();
}
else if (choice == 'c'){
	method3();
}

//question 4
//assume the variable is called input
while (input < 0 && input % 2 != 0){
	//loop body
}

//question 5
//a
public void calculate (int a, int b, int c, double d){
	//code here
}

//b 
public void calculate (double a, double b){
//code here
}