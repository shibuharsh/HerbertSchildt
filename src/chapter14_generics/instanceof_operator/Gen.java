package chapter14_generics.instanceof_operator;

//Use the instanceof operator with a generic class hierarchy.  
class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}
}