class A{}
class B extends A{}
class C extends B{}

class X{
	B getB(){ return new B();}
}
class Y extends X{
	//method declaration here
}
