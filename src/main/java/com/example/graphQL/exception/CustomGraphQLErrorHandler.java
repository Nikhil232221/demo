package com.example.graphQL.exception;

import java.util.List;

import org.springframework.stereotype.Component;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.language.SourceLocation;
import graphql.schema.DataFetchingEnvironment;

import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;

@Component
public class CustomGraphQLErrorHandler extends DataFetcherExceptionResolverAdapter {

	@Override
	protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
		return GraphqlErrorBuilder.newError(env).message(ex.getMessage()).errorType(ErrorType.DataFetchingException) // Optional:
																														// use
																														// a
																														// custom
																														// error
																														// type
				.build();
	}

}
