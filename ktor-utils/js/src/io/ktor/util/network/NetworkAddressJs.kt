/*
 * Copyright 2014-2020 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.util.network

/**
 * Represents remote endpoint with [hostname] and [port].
 *
 * The address will be resolved after construction.
 *
 * @throws UnresolvedAddressException if the [hostname] cannot be resolved.
 */
public actual class NetworkAddress internal constructor(
    internal val hostname: String,
    internal val port: Int,
    internal val address: String
)

/**
 * Network address hostname.
 */
public actual val NetworkAddress.hostname: String
    get() = hostname

/**
 * Network address port.
 */
public actual val NetworkAddress.port: Int
    get() = port

/**
 * Represents remote endpoint with [hostname] and [port].
 *
 * The address will be resolved after construction.
 *
 * @throws UnresolvedAddressException if the [hostname] cannot be resolved.
 */
public actual fun NetworkAddress(hostname: String, port: Int): NetworkAddress =
    NetworkAddress(hostname, port, hostname)

@Suppress("KDocMissingDocumentation")
public actual class UnresolvedAddressException : IllegalArgumentException()
