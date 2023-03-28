package com.dkatalis.grpcdemo.grpc

import org.dktalis.GetUsersMessageV1
import org.dktalis.UserMessageV1
import org.dktalis.UserServiceV1GrpcKt
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class UserServiceV1 : UserServiceV1GrpcKt.UserServiceV1CoroutineImplBase() {
    override suspend fun getUser(request: GetUsersMessageV1): UserMessageV1 {
        return UserMessageV1.newBuilder()
                .setId("123123")
                .setFullName("full name")
                .setEmail("email@email.test")
                .setPhoneNumber("080000000001")
                .addRoles( "CUSTOMER")
                .addRoles( "ADMIN")
                .build()
    }
}