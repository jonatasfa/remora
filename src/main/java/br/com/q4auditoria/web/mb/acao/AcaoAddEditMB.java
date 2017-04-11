package br.com.q4auditoria.web.mb.acao;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.AcaoEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "acaoAddEditMB")
public class AcaoAddEditMB extends BaseEntity {

	private static final long serialVersionUID = -6004410489185793536L;
	
	@Inject
	private IAcaoService acaoService;
	
	@Inject
	private AcaoMB mbAcaoBean;
	
	private AcaoEntity acao;
	
	private String title;
	
	public AcaoAddEditMB(){
		acao = new AcaoEntity();
	}

	public AcaoEntity getAcao(){
		return this.acao;
	}
	
	public void add() {
		this.title = "Adicionar";
	}

	public void update() {
		this.acao = this.mbAcaoBean.getSelectedAcao();
		this.title = "Alterar";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void save() {
		if (this.acao != null) {
			if (this.acao.getId() == null) {
				// Add
				this.acaoService.insert(this.acao);
			} else {
				// Update
				this.acaoService.update(this.acao);
			}
		}
	}
}
