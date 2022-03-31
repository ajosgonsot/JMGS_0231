import java.util.*;
import java.time.*;
import java.time.format.*;

public class Test03_date {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("");

	
		/* CLASE DATE (paquete java.util) */
		
		/* Permite representar un instante dado con precisión de milisegundos
		 * La fecha y la hora se almacenan en un entero tipo Long
		 * que registra los milisegundos transcurridos desde el 1/1/1970 GMT
		 * (tiempo del meridiano de Greenwich) a las 00:00:00 */

		//~ Date d=new Date();
		//~ System.out.println(d);

		//~ long hoy=System.currentTimeMillis();
		//~ Date d=new Date();
		//~ d.setTime(hoy);
		//~ System.out.println(d.toString());
		

		/* CLASE CALENDAR Y GREGORIANCALENDAR (paquete java.util) */

		/* Para la utilización de fechas se suele utilizar la clase GregorianCalendar,
		 * que deriva de la clase abstracta Calendar.
		 * Aquí las horas se representan por un número entre 0 y 23,
		 * los días entre 1 y 31, y los años se representan por cuatro dígitos.
		 * El problema es que los meses se representan del 0 al 11.*/
		 
		//~ Calendar c=Calendar.getInstance();
		//~ System.out.println(c.getTime().toString());
		//~ System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
		//~ System.out.println("Mes: "+(c.get(Calendar.MONTH)+1));
		//~ System.out.println("Año: "+c.get(Calendar.YEAR));
		//~ System.out.println("Hora: "+c.get(Calendar.HOUR));
		//~ System.out.println("Minuto: "+c.get(Calendar.MINUTE));
		//~ System.out.println("Segundo: "+c.get(Calendar.SECOND));

		//~ GregorianCalendar g=new GregorianCalendar();
		//~ //GregorianCalendar g=new GregorianCalendar(2015,11,25);
		//~ //g.set(2015,0,1); // otra forma de asignar una fecha
		//~ //g.set(2015,0,1,1,2,3); // otra forma: año, mes, dia, hora, minuto, segundo
		//~ System.out.println(g.getTime().toString());
		//~ System.out.println("Dia: "+g.get(Calendar.DAY_OF_MONTH));
		//~ System.out.println("Mes: "+(g.get(Calendar.MONTH)+1)); // Ojo se suma 1 !!
		//~ System.out.println("Año: "+g.get(Calendar.YEAR));
		//~ System.out.println("Hora: "+g.get(Calendar.HOUR)); // Tb existe HOUR_OF_DAY
		//~ System.out.println("Minuto: "+g.get(Calendar.MINUTE));
		//~ System.out.println("Segundo: "+g.get(Calendar.SECOND));


		/* FECHAS Y TIEMPOS API JAVA 8 (paquete java.time) */

		DayOfWeek lunes=DayOfWeek.MONDAY;
		System.out.println(lunes);
		Month mes=Month.JANUARY;
		System.out.println(mes);
		
		Locale l=new Locale("es","ES");
		System.out.println(lunes.getDisplayName(TextStyle.FULL,l));
		System.out.println(lunes.getDisplayName(TextStyle.SHORT,l));
		System.out.println(lunes.getDisplayName(TextStyle.NARROW,l));
		System.out.println(mes.getDisplayName(TextStyle.FULL,l));
		System.out.println(mes.getDisplayName(TextStyle.SHORT,l));
		System.out.println(mes.getDisplayName(TextStyle.NARROW,l));
		
		LocalDate d=LocalDate.now();
		//LocalDate d=LocalDate.of(2015,11,1);
		System.out.println(d);
		System.out.println(d.getDayOfMonth()+"/"+d.getMonthValue()+"/"+d.getYear());
		System.out.printf("%02d/%02d/%04d\n",d.getDayOfMonth(),d.getMonthValue(),d.getYear());
		System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
		
		LocalTime t=LocalTime.now();
		//LocalTime t=LocalTime.of(1,2,3);
		System.out.println(t);
		System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());
		System.out.printf("%02d:%02d:%02d\n",t.getHour(),t.getMinute(),t.getSecond());
		System.out.println(t.format(DateTimeFormatter.ofPattern("hh:mm:ss"))); // "kk:mm:ss" 
		
		// Tb podemos utilizar la clase LocalDateTime
		
		System.out.println("");
	}
}
