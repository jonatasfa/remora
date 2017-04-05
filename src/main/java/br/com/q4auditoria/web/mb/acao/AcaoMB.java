package br.com.q4auditoria.web.mb.acao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.AcaoEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "acaoMB")
public class AcaoMB extends BaseEntity {

	private static final long serialVersionUID = 3734135385034434628L;

	private static final Logger logger = Logger.getLogger(AcaoMB.class);
	
	@Inject
	private IAcaoService acaoService;
	
	private List<AcaoEntity> listaAcao;

	private AcaoEntity selectedAcao;

	public AcaoMB() {
	}

	public void delete() {
		if (this.selectedAcao != null) {
			this.acaoService.delete(this.selectedAcao);
		}
	}

	public void onLoad() {
		this.listaAcao = this.acaoService.findAll();
	}

	public List<AcaoEntity> getListaAcao() {
		return this.listaAcao;
	}

	public void selectAcao(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.selectedAcao = (AcaoEntity)evt.getObject();
			} else {
				this.selectedAcao = null;
			}
		} catch (Exception e) {
			this.selectedAcao = null;
			logger.error(e.getMessage(), e);
		}
	}

	public void unselectAcao() {
		this.selectedAcao = null;
	}

	public AcaoEntity getSelectedAcao() {
		return this.selectedAcao;
	}

	public void setSelectedAcao(AcaoEntity selectedAcao) {
		this.selectedAcao = selectedAcao;
	}
}
