package Structures;

public class Element{// implements Cloneable {
	private Integer value;
	private Element nextElement;
	
	public boolean hasNext(){//���� �� ���������
		if (this.nextElement==null)
		return false;
		else return true;
		}
	
	public Element next(){// ������� ���������
		if (hasNext()){
			Element tempEl=nextElement;
			return tempEl;
		}
		else
		return null;
		}
	public void remove(){	}//������� �������
	
	public Element getElement(){
		Element tempEl=new Element();
		tempEl=this;
		return tempEl;
		}
	public void setElement(Integer newValue, Element newNextElement){
		value=newValue;
		nextElement=newNextElement;
	}
	public void setElement(Integer newValue){
		value=newValue;
	}

	public Integer getValue(){//added myself
		Integer tempInt=value;
		return tempInt;
		}

	/*@Override
	public Element clone(){
		Element tempEl=new Element();
		tempEl.value=this.value;
		tempEl.nextElement=this.nextElement;
		return tempEl;}*/
}
