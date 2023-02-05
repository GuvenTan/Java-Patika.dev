package MathVeString;

import java.util.Arrays;

public class StringClassMetotları {

	public static void main(String[] args) {
		
		String str = "patika";
		String str2 = "paTİka";
		
		// String değerdeki indis aranır.
		System.out.println(str.charAt(2));
		
		// Stringdeki girilen indisin Ascii kodunu bulabiliriz.
		System.out.println(str.codePointAt(1));
		
		// girilen indisten önceki char'ın Ascii kodunu verir.
		System.out.println(str.codePointBefore(2));
		
		// karşılaştırma yapar 2 string arasında eğer aynıysa 0 verir değilse
		// bir sayı değeri çıkar.
		System.out.println(str.compareTo(str2));
		
		// büyük küçük harf duyarlılığını ortadan kaldırarak karşılşatırma yapar.
		System.out.println(str.compareToIgnoreCase(str2));
		
		// belirlenen string değerinin sonuna girilen stringi ekler.
		System.out.println(str.concat(".dev"));
		
		// girilen değerin olup olmadığını boolean olarak geri döndürür.
		System.out.println(str.contains("at"));
		
		// girilen değer ile bitmiş mi onu kontrol eder.
		System.out.println(str.endsWith("a"));
		
		// girilen str ile kontrol edilen str aynı mı değil mi kontrol eder.
		System.out.println(str.equals("patika"));
		
		// büyük kük harf ortadan kaldırılır ve eşitliği kontrol edilir.
		System.out.println(str.equalsIgnoreCase("paTika"));
		
		// girilen char ın index numarasını verir.
		System.out.println(str.indexOf("p"));
		
		// str boş mu dolu mu kontrol eder.
		System.out.println(str.isEmpty());
		
		// girilen char str içindeki en son char indisini verir.
		System.out.println(str.lastIndexOf("a"));
		
		// Stringin uzunluğunu verir.
		System.out.println(str.length());
		
		// seçilen char diğer girilen char ile değiştirilir.
		System.out.println(str.replace("a", "b"));
		
		// bulunan ilk a değerini b ile değiştirir.
		System.out.println(str.replaceFirst("a", "b"));
		
		// a ya göre stringi ayırır.
		String[] str3 = str.split("a");
		System.out.println(Arrays.toString(str3));
		
		// stringin a ile başlayıp başlamdığını kontrol eder.
		System.out.println(str.startsWith("p"));
		
		// girilen indisten sonraki değerleri alır.
		System.out.println(str.substring(2));
		
		// istenen stringin tüm harflerini küçültür tam tersi uppercase( metotudur)
		System.out.println(str.toLowerCase());
		
		// Girilen stringin sonunda ve başında bir boşluk varsa onu siler.
		System.out.println(str.trim());
		
		// girilen indisteki char ı verir. ??????
		System.out.println(str.valueOf(0));
		
		
		
	}

}









