#!/bin/ruby

require 'json'
require 'stringio'



N = gets.strip.to_i

if N%2 !=0
    puts 'Weird'
elsif N<=5
    puts 'Not Weird'
elsif N<=20
    puts 'Weird'
elsif N>20
    puts 'Not Weird'
end