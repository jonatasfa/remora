package br.com.q4auditoria.web.mb.acaofuncionalidade;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.AcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoFuncionalidadeService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "acaoFuncionalidadeAddEditMB")
public class AcaoFuncionalidadeAddEditMB extends BaseEntity {

	private static final long serialVersionUID = -7085718821170294106L;
	
	@Inject
	private IAcaoFuncionalidadeService acaoFuncionalidadeService;
	
	@Inject
	private AcaoFuncionalidadeMB mbAcaoFuncionalidadeBean;
	
	private AcaoFuncionalidadeEntity acaoFuncionalidade;
	
	private String title;
	
	public AcaoFuncionalidadeAddEditMB(){
		this.acaoFuncionalidade = new AcaoFuncionalidadeEntity();
	}
	
	public AcaoFuncionalidadeEntity getAcaoFuncionalidade(){
		return this.acaoFuncionalidade;
	}
	
	public void add(){
		this.title = "Adicionar";
	}
	
	public void update(){
		this.acaoFuncionalidade = mbAcaoFuncionalidadeBean.getSelectedAcaoFuncionalidade();
		this.title = "Alterar";
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void save(){
		if (this.acaoFuncionalidade != null){
			if (this.acaoFuncionalidade.getAfId() != null){
				this.acaoFuncionalidadeService.insert(acaoFuncionalidade);
			}else{
				this.acaoFuncionalidadeService.update(acaoFuncionalidade);
			}
		}
	}

}
