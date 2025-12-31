public class SampleEq{

    @Override
    public boolean equals(Object param){
        //--check if it is null
        if(param == null){
            return false;
        }

        //--Check of it is the correct class
        if(!(param instanceof SampleEq)){
            return false;
        }

        //--Check if this is myself
        if(this == param){
            return true;
        }
        //---Check for equality using fields (AKA instance variable) of this class
        //---compared to the param
        //---return true or false
    }
}
