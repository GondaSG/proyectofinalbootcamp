package com.sistemabancario.documenttype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemabancario.documenttype.domain.DocumentType;
import com.sistemabancario.documenttype.repository.IDocumentTypeRepository;
import com.sistemabancario.documenttype.service.IDocumentTypeService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DocumentTypeService implements IDocumentTypeService {
	@Autowired
	private final IDocumentTypeRepository documentTypeRepository;
	@Override
	public Flux<DocumentType> findAll() {
		return documentTypeRepository.findAll();
	}

	@Override
	public Mono<DocumentType> findById(String id) { 
		return documentTypeRepository.findById(id);
	}

	@Override
	public Mono<DocumentType> save(DocumentType documentType) {
		return documentTypeRepository.save(documentType);
	}

	@Override
	public Mono<DocumentType> update(DocumentType documentType) {
		return documentTypeRepository.save(documentType);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return documentTypeRepository.deleteById(id);
	}
}
