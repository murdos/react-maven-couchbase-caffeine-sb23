package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.Authority;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * Spring Data Couchbase repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends CouchbaseRepository<Authority, String> {
}
