/**
*You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
*Check if these points make a straight line in the XY plane.
*/



class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2)
            return true;
        else{
            
            int f=0;
            if((coordinates[1][1]-coordinates[0][1])==0)
            {
                for(int i=2;i<coordinates.length;i++)
                {
                    if((coordinates[i][1]-coordinates[i-1][1])!=0)
                    {f=1;break;}
                }
            }
            else{
                int slope;
            slope=(coordinates[1][0]-coordinates[0][0])/(coordinates[1][1]-coordinates[0][1]);
            for(int i=2;i<coordinates.length;i++)
            {
                if((coordinates[i][1]-coordinates[i-1][1])==0)
                {f=1;break;}
                else if((coordinates[i][0]-coordinates[i-1][0])/(coordinates[i][1]-coordinates[i-1][1])!=slope)
                {
                    f=1;
                    break;
                }
                
            }}
            if(f==1)
                return false;
            else
                return true;
}}}
