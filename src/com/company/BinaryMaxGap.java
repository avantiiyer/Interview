package com.company;

class BinaryMaxGap {

        public static void main(String[] args) {
            int a = solution(1421);
            System.out.println(a);
        }
        public static int solution(int N) {
            String conv=Integer.toBinaryString(N);
            StringBuilder sb=new StringBuilder(conv);
            if(sb.length()<=2)
                return -1;
            int count=0;
            int maxGap=0;
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)=='1' && sb.charAt(i+1)=='0'){
                    if(count>maxGap)
                        maxGap=count;
                    count=0;
                }else if(sb.charAt(i)=='0'){
                    count++;
                }
            }
            if(maxGap<count){
                return count;
            }
            else{
                return maxGap;
            }
        }
    }
