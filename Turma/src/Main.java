import java.time.DayOfWeek;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Turma> turmas = new Vector<Turma>();
		turmas.add(new Livre(1, DayOfWeek.MONDAY, Ead.Periodo.manha));
		turmas.add(new Ead(2, DayOfWeek.TUESDAY, Ead.Periodo.tarde));
		turmas.add(new Livre(3, DayOfWeek.WEDNESDAY, Ead.Periodo.noite));
		turmas.add(new Ead(4, DayOfWeek.THURSDAY, Ead.Periodo.tarde));
		turmas.add(new Turma(5, DayOfWeek.FRIDAY, Ead.Periodo.manha));

		String[] nomes = { "Helena", "Alexsandro", "Alice", "Arthur", "Laura", "Heitor", "Manuela", "Bernardo",
				"Valentina", "Davi", "Sophia", "Th�o", "Isabella", "Lorenzo", "Helo�sa", "Gabriel", "Luiza", "Pedro",
				"J�lia", "Benjamin", "Lorena", "Matheus", "L�via", "Lucas", "Maria", "Luiza", "Nicolas", "Cec�lia",
				"Joaquim", "Elo�", "Samuel", "Giovanna", "Henrique", "Maria", "Clara", "Rafael", "Maria", "Eduarda",
				"Guilherme", "Mariana", "Enzo", "Lara", "Murilo", "Beatriz", "Ben�cio", "Antonella", "Gustavo", "Maria",
				"J�lia", "Isaac", "Emanuelly", "Jo�o", "Miguel", "Isadora", "Lucca", "Ana", "Clara", "Enzo", "Gabriel",
				"Melissa", "Pedro", "Henrique", "Ana G", "Luiza", "Felipe", "Ana F", "J�lia", "Jo�o", "Pedro", "Esther",
				"Pietro", "Lav�nia", "Anthony", "Mait�", "Daniel", "Maria", "Cec�lia", "Bryan", "Maria", "Alice",
				"Davi", "Lucca", "Sarah", "Leonardo", "Elisa", "Vicente", "Liz", "Eduardo", "Yasmin", "Gael",
				"Isabelly", "Ant�nio", "Al�cia", "Vitor", "Clara", "Noah", "Isis", "Caio", "Rebeca", "Jo�o", "Rafaela",
				"Emanuel", "Marina", "Cau�", "Ana", "Laura", "Jo�o Bosco", "Lucas", "Maria", "Helena", "Calebe",
				"Agatha", "Enrico", "Gabriela", "Vin�cius", "Catarina", "Bento" };

		Vector<Aluno> alunos = new Vector<Aluno>();
		int i = 0;
		while (i < 117) {
			Aluno a = new Aluno(i, nomes[i]);
			a.verFreq();
			alunos.add(a);
			turmas.elementAt(i / 25).cadastrarAluno(a);
			i++;
		}
		for (Turma t : turmas) {
			t.diaProva();
			t.diaProva();
			t.diaProva();
			t.diaProva();
		}
		for (Turma t : turmas) {
			t.printRelatorio();
		}
	}
}
