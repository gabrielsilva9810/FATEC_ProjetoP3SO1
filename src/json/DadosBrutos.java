package json;

public class DadosBrutos {
	
	public String name;
    public String unit;
    public String value; //double
    public String type;
     
    //-------------------------NAME------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //--------------------------------------------------------//
    //----------------------------UNIT---------------------------//
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    //--------------------------------------------------------//
    //----------------------------VALUE---------------------------//

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //--------------------------------------------------------//
    //----------------------------TYPE---------------------------//
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //--------------------------------------------------------//
	@Override
	public String toString() {
		return "dadosBrutos"
				+ "[name=" + name 
				+ ", unit=" + unit 
				+ ", value=" + value 
				+ ", type=" + type 
				+ "]";
	}
    
}
