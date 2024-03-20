class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ "); // 다항식을 항으로 분리
        int xCoefficient = 0; // 일차 항의 계수 합
        int constantSum = 0; // 상수항의 합

        for (String term : terms) {
            if (term.contains("x")) {
                // 일차 항 처리
                int coeff = term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
                xCoefficient += coeff;
            } else {
                // 상수항 처리
                constantSum += Integer.parseInt(term);
            }
        }

        // 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        if (xCoefficient != 0) {
            if (xCoefficient != 1) {
                sb.append(xCoefficient); // 계수가 1이 아니면 추가
            }
            sb.append("x");
        }
        if (constantSum != 0) {
            if (sb.length() > 0) sb.append(" + "); // 이미 일차 항이 있으면 + 추가
            sb.append(constantSum);
        }

        return sb.toString();
    }
}
