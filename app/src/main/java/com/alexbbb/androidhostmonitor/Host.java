package com.alexbbb.androidhostmonitor;

import java.net.InetSocketAddress;

/**
 * Represents a host to monitor.
 * @author alexbbb (Aleksandar Gotev)
 */
public class Host {
    private String host;
    private int port;

    public Host(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public InetSocketAddress resolve() {
        return new InetSocketAddress(host, port);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Host host1 = (Host) o;

        if (port != host1.port) return false;
        return host.equals(host1.host);

    }

    @Override
    public int hashCode() {
        int result = host.hashCode();
        result = 31 * result + port;
        return result;
    }
}
