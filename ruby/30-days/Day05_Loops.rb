#!/bin/ruby

require 'json'
require 'stringio'



n = gets.strip.to_i

for number in 1..10 do
    product=n*number
    puts n.to_s+" x "+number.to_s+" = "+product.to_s
end