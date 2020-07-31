package br.com.bridi.commandPattern;

public class Main {

	/**
	 * Utilizar quando: Parametrizar objetos por uma a��o a ser executada. Voc� pode
	 * expressar tal parametriza��o numa linguagem procedural atrav�s de uma fun��o
	 * callback, ou seja, uma fun��o que � registrada em algum lugar para ser
	 * chamada em um momento mais adiante. Os Commands s�o uma substitui��o
	 * orientada a objetos para callbacks; Especificar, enfileirar e executar
	 * solicita��es em tempos diferentes. Um objeto Command pode ter um tempo de
	 * vida independente da solicita��o original. Se o receptor de uma solicita��o
	 * pode ser representado de uma maneira independente do espa�o de endere�amento,
	 * ent�o voc� pode transferir um objeto Command para a solicita��o para um
	 * processo diferente e l� atender a solicita��o; Suportar desfazer opera��es. A
	 * opera��o Execute, de Command, pode armazenar estados para reverter seus
	 * efeitos no pr�prio comando. A interface do Command deve ter acrescentada uma
	 * opera��o Unexecute, que o reverte.efeitos de uma chamada anterior de Execute.
	 * Os comandos executados s�o armazenados em uma lista hist�rica. O n�vel
	 * ilimitado de desfazer e refazer opera��es � obtido percorrendo esta lista
	 * para tr�s e para frente, chamando opera��es Unexecute e Execute,
	 * respectivamente.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Light lamp = new Light();
		ICommand switchUp = new LightOnCommand(lamp);
		ICommand switchDown = new LightOffCommand(lamp);

		Switch mySwitch = new Switch();

		mySwitch.storeAndExecute(switchUp);
		mySwitch.storeAndExecute(switchDown);

	}

}
