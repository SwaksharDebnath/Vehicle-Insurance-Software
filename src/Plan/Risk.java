package Plan;

public abstract class Risk {
    float premium;
    float coverage;
    float ceiling;
    public boolean isCovered(String[] riskCovered, String[] claimed){
        for(int i = 0; i < claimed.length; ++i){
            for(int j = 0; j < riskCovered.length; ++j){
                if(claimed[i] == riskCovered[j]){
                    break;
                }
                if(j == riskCovered.length){
                    return  false;
                }
            }
        }
        return  true;
    }

    public abstract  float getPremium();
    public abstract  float getCoverage();
    public abstract  float getCeiling();
}
