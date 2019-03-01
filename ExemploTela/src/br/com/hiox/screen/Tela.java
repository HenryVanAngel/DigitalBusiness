package br.com.hiox.screen;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Tela {

	protected Shell shell;
	private Text text;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(620, 491);
		shell.setText("SWT Application");
		
		Label lblPes = new Label(shell, SWT.NONE);
		lblPes.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblPes.setBounds(44, 31, 208, 35);
		lblPes.setText("Pesquisa de Produtos");
		
		Label lblCdigoDoProduto = new Label(shell, SWT.NONE);
		lblCdigoDoProduto.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblCdigoDoProduto.setBounds(44, 117, 148, 21);
		lblCdigoDoProduto.setText("C\u00F3digo do Produto:");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(200, 119, 102, 21);
		
		Button btnPesquisar = new Button(shell, SWT.NONE);
		btnPesquisar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shell, "SWT","Ola Mundo!");
			}
		});
		btnPesquisar.setBounds(321, 112, 94, 34);
		btnPesquisar.setText("Pesquisar");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(44, 199, 303, 178);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Descri\u00E7\u00E3o");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Quantidade");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(99);
		tblclmnNewColumn_2.setText("Pre\u00E7o");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		
		TableItem tableItem_5 = new TableItem(table, SWT.NONE);

	}
}
