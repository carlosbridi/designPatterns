package br.com.bridi.commandPattern;

public class Main {

	/**
	 * Utilizar quando: Parametrizar objetos por uma ação a ser executada. Você pode
	 * expressar tal parametrização numa linguagem procedural através de uma função
	 * callback, ou seja, uma função que é registrada em algum lugar para ser
	 * chamada em um momento mais adiante. Os Commands são uma substituição
	 * orientada a objetos para callbacks; Especificar, enfileirar e executar
	 * solicitações em tempos diferentes. Um objeto Command pode ter um tempo de
	 * vida independente da solicitação original. Se o receptor de uma solicitação
	 * pode ser representado de uma maneira independente do espaço de endereçamento,
	 * então você pode transferir um objeto Command para a solicitação para um
	 * processo diferente e lá atender a solicitação; Suportar desfazer operações. A
	 * operação Execute, de Command, pode armazenar estados para reverter seus
	 * efeitos no próprio comando. A interface do Command deve ter acrescentada uma
	 * operação Unexecute, que o reverte.efeitos de uma chamada anterior de Execute.
	 * Os comandos executados são armazenados em uma lista histórica. O nível
	 * ilimitado de desfazer e refazer operações é obtido percorrendo esta lista
	 * para trás e para frente, chamando operações Unexecute e Execute,
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
