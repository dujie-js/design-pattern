package com.js.prototype;

public class Prototype implements Cloneable {

    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
//public class Prototype implements Cloneable {
//	private ArrayList list = new ArrayList();
//	public Prototype clone(){
//		Prototype prototype = null;
//		try{
//			prototype = (Prototype)super.clone();
//			prototype.list = (ArrayList) this.list.clone();
//		}catch(CloneNotSupportedException e){
//			e.printStackTrace();
//		}
//		return prototype;
//	}
//}