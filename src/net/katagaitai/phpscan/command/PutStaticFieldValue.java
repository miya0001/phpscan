package net.katagaitai.phpscan.command;

import lombok.Value;
import net.katagaitai.phpscan.interpreter.Interpreter;
import net.katagaitai.phpscan.util.SymbolUtils;

@Value
public class PutStaticFieldValue implements Command {
	private String clazz;
	private String name;
	private String value;

	public String toString() {
		return String.format("%s::$%s = %s", clazz, name,
				SymbolUtils.decodeSymbolString(value));
	}

	@Override
	public void accept(Interpreter vm) {
		vm.accept(this);
	}

}
