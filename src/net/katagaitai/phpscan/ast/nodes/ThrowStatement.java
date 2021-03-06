/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Zend Technologies
 *******************************************************************************/
package net.katagaitai.phpscan.ast.nodes;

import lombok.Getter;
import lombok.Setter;
import net.katagaitai.phpscan.ast.Visitor;

/**
 * Represent a break statement
 *
 * <pre>
 * e.g.&lt;pre&gt; throw $exceptionClass;
 *
 */
public class ThrowStatement extends Statement {
	@Setter
	@Getter
	private Expression expression;

	public ThrowStatement(int start, int end, AST ast, Expression expr) {
		super(start, end, ast);

		if (expr == null) {
			throw new IllegalArgumentException();
		}
		setExpression(expr);
	}

	public ThrowStatement(AST ast) {
		super(ast);
	}

	public void toString(StringBuffer buffer, String tab) {
		buffer.append(tab).append("<ThrowStatement"); //$NON-NLS-1$
		appendInterval(buffer);
		buffer.append(">\n"); //$NON-NLS-1$
		expression.toString(buffer, TAB + tab);
		buffer.append("\n"); //$NON-NLS-1$
		buffer.append(tab).append("</ThrowStatement>"); //$NON-NLS-1$
	}

	@Override
	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
