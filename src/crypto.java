import sha1.*;

import java.io.UnsupportedEncodingException;

public class crypto {
    public String priKey =
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDy++sEwc1Zz1n2" +
            "PPgdgSaUNUIUn1dLY1l+oehWuBWwOm+QX5cYsrj62/2t0iRPdIrhvi8U5fvfTJRA" +
            "AfhXH6NiIx9xkAOx3g9mE6PfPNKH0eUu6SuVi2rOeCSaM/PWpWPbp84+PdQct9yR" +
            "mTM34SJggd6xYJCdy4E+6oqlL5QeegHVffv9I1fSkDGIQzV8+6c+Ybdz300TsCkj" +
            "TqPzoHIc2h7tgn+JeZw60xes7cZjjeNnH6X6Htl9dIvUSGvTU9kHQNck1dKMhUt4" +
            "glWcu0zYScwPeqYE99KH//wm0KgiAwlPu4mr4Wt1wF4hDdiFIJFSGzHOOVgTwtls" +
            "qvdFUMU7AgMBAAECggEAFRXFPCFxJ2T14odB5JWLenrwpAd7tMAHSRTVq4jH4QYB" +
            "Hl8dJniD0sj6R3YfzoFHd/Vf8olOhP8JMlC5cx38uIxhsyITIAEsBuiXZMzLXBvb" +
            "rmlvbceuWgJU8silVS/+7VWvcPk+ictuqXfI2QWBTSyX3X6Krha1vXbu1wy85rP2" +
            "X+qZPL3RxYCO7PXkbJqsznArTQc3y4a798s6eE2PaJHe0wezMHaSzlcdAjj4yYYK" +
            "QZs6NtRNOgptXUH9sJpL3L+FAhX2UIokuT5sqFy3ssDFZ0UkKSKYEA0XWK/DLcJ0" +
            "r4stlPJv/8L4pZipXdHWq73tQr9VWHTkHT+au1bUGQKBgQD961YVsXFC211c32GY" +
            "HFOPHrY5bINxWAwGxg9VGNJjJ6bfQDofnS0BCP2874Ax8C6v/j1VQG2vR+zwu7Nq" +
            "FKK9DzZM6N3/on1NF1trCEqKSw1HRvbDgJ+T30dfnFEt4YilWLpMAEPbI9wrwkOY" +
            "jnEs1w/XVPspSFjZcp5/GXuVFwKBgQD0+aRnbaJkwzyI4E2LFEMEZu39ui4Kg9gD" +
            "o+lz4MphVE3hPXEl+0FAFppegY8dlsLrOL3FclH0q8EpZwbxJxUFgSO23KCzsjyx" +
            "vyL1njyhQ7SzmNHgWAQaWRUweFofBzDFYJIu8eIIrk70LdhL023fqRFXHLXfk+Zl" +
            "QQzJEMxvfQKBgQD7ITL9t4YuOmkHPoL2fyWBSj2tY45Inm0ekep+HlON75yR9qLF" +
            "u5zUBkF2CGWAfmyecVPVqigREJDdsraKdyhQ1ee9fx55AwrsIOqwW/3k8r+KPDw4" +
            "NVEeXdjoTeDYANQ1vCBcpHJ4HOpXeQWDr3VthLJNJOZW+Q+u2Da7u8dHNwKBgB5P" +
            "qUz23soS8jGJd27HAgfQaJAlcj7w01CX/nHNFZ13Xe+Jt69YaFlysoURCNFDbzjF" +
            "m42LuKJKgisKSWybRlmZAf9FS0kQu7vOh5fWjW/yvbAfL5DPsypDbYDC03vVWu6B" +
            "JXVTjoE+eBx0c7fmIEk1VSTvM33HghFzPA7A2lrNAoGAYTezvocm3iyIvRyHPYKN" +
            "dLlvVFedictRf+DHn+L0mu5s2uvbHYQWlA/Ls6YCeQXN4GBG0yZmX1V699lv1mEL" +
            "gSCOf1DJl/kRYaBxN7pgb4eIo/A4iPkZyNPrOW+LUFGglpBDim2y73WIl8AKBYXW" +
                    "DvnG6yzCimfAHD80tCISJNQ=";

    public String pubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8vvrBMHNWc9Z9jz4HYEm" +
        "lDVCFJ9XS2NZfqHoVrgVsDpvkF+XGLK4+tv9rdIkT3SK4b4vFOX730yUQAH4Vx+j" +
        "YiMfcZADsd4PZhOj3zzSh9HlLukrlYtqzngkmjPz1qVj26fOPj3UHLfckZkzN+Ei" +
        "YIHesWCQncuBPuqKpS+UHnoB1X37/SNX0pAxiEM1fPunPmG3c99NE7ApI06j86By" +
        "HNoe7YJ/iXmcOtMXrO3GY43jZx+l+h7ZfXSL1Ehr01PZB0DXJNXSjIVLeIJVnLtM" +
        "2EnMD3qmBPfSh//8JtCoIgMJT7uJq+FrdcBeIQ3YhSCRUhsxzjlYE8LZbKr3RVDF" +
        "OwIDAQAB";

    //public String signStr = "{\"ins_id_cd\":\"10000405\",\"chn_ins_id_cd\":\"10000405\",\"prod_cd\":\"1151\",\"biz_cd\":\"0000007\",\"mcht_cd\":\"996161109370039\",\"tran_dt_tm\":\"20161221161651\",\"order_id\":\"20161221161651883191\",\"tran_amt\":\"1\",\"qr_code_info\":{\"noti_url\":\"http://192.168.30.10:8088/prodpmpnotify\"},\"tran_cd\":\"7131\"}";
    public String signStr = "{\"ins_id_cd\":\"10000405\",\"prod_cd\":\"1151\",\"biz_cd\":\"0000007\",\"mcht_cd\":\"996161109370039\",\"tran_dt_tm\":\"20161221161651\",\"order_id\":\"20161221161651883191\",\"tran_amt\":\"1\",\"qr_code_info\":{\"noti_url\":\"http://192.168.30.10:8088/prodpmpnotify\"},\"tran_cd\":\"7131\"}";
    public static void main(String[] args) {
        System.out.println("hello");
        crypto ct = new crypto();
        RSAHelper cipher = new RSAHelper();

        String signedStr = "";
        System.out.println(ct.signStr);
        try {
            cipher.initKey(ct.priKey, ct.pubKey,2048);
            signedStr = cipher.sign(ct.signStr);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }


        System.out.println(signedStr);
    }
}